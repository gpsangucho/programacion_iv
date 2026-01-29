import { httpClient } from "../../../core/http/httpClient";
import type { Category, Paginated, Product } from "../domain/entities";
import type { ListProductsParams } from "../domain/repositories";

export const catalogApi = {
  async listCategories() {
    const res = await httpClient.get<any>("/categories/");
    // tu API puede devolver lista directa o { results: [] }
    return Array.isArray(res.data) ? (res.data as Category[]) : (res.data.results as Category[]);
  },

  async listProducts(params?: ListProductsParams) {
    const res = await httpClient.get<Paginated<Product>>("/products/", { params });
    return res.data;
  },
};
