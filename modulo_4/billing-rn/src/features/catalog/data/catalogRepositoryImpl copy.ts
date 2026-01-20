import type { CatalogRepository, ListProductsParams } from "../domain/repositories";
import type { Paginated, Product } from "../domain/entities";
import { catalogApi } from "./catalogApiDataSource";

export const catalogRepositoryImpl: CatalogRepository = {
  listCategories: () => catalogApi.listCategories(),
  listProducts: (params?: ListProductsParams): Promise<Paginated<Product>> =>
    catalogApi.listProducts(params),
};
