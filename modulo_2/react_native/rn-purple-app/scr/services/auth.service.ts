import api from "./api";
import { authStore } from "../store/auth";
import { Platform } from "react-native";

// API pública: https://reqres.in
//const BASE = "https://reqres.in/api";
//const BASE = "http://localhost:8000/api/auth";
const host = Platform.OS === "android" ? "10.0.2.2" : "localhost";

//La siguiente linea debe sustituirse con la url de nuestro backend.
export const BASE = 'http://${host}:8000/api/auth';
/*
export async function login(email: string, password: string) {
  const { data } = await api.post(`${BASE}/login`, { email, password });
  authStore.set({ token: data.token, email });
  return data;
}
  */
export async function login(email: string, password: string) {
    const { data } = await api.post(`${BASE}/login`, { username: email, password });
    authStore.set({ token: data.token, email });
    return data;
  }


  export async function register(email: string, password: string) {
    try {
      const { data } = await api.post(`${BASE}/register`, { username: email, email, password });
      // Opcional: guardar token si devuelve
      authStore.set({ token: data.token ?? null, email });
      return data;
    }
    catch (err:any){
      console.log('REGISTER ERROR =>', err.response?.status,err.response?.data || err.message);
      throw err;
    }

  }
/*
  export async function register(email: string, password: string) {
    const { data } = await api.post(`${BASE}/register`, { username: email, email, password });
    // Opcional: guardar token si devuelve
    authStore.set({ token: data.token ?? null, email });
    return data;
  }
    */

  /*
export async function register(email: string, password: string) {
  const { data } = await api.post(`${BASE}/register`, { email, password });
  // Opcional: guardar token si devuelve
  authStore.set({ token: data.token ?? null, email });
  return data;
}
  */

export function logout() {
  authStore.clear();
}