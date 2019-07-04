import { Injectable } from '@angular/core';
import { Produto } from '../models/produto';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
   headers: new HttpHeaders({ 'Content-Type' : 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class ProdutoInfoService {
  webApiUrl: string =  'http://localhost:8080/alclog-challenge-backend-1.0-SNAPSHOT/rest/v1/produto';
  constructor(private http: HttpClient) { }
  getAllProdutos(){
       return this.http.get<Produto[]>(this.webApiUrl);
  }

  saveProdutos(produto: Produto){
	const body = JSON.stringify(produto);
	alert("POST JSON is => "+ body);
    return this.http.post<any>(this.webApiUrl,body,httpOptions);
  }

  deleteProduto(id: number){
    return this.http.delete<any>(this.webApiUrl+'/remove/'+id);
  }
}
