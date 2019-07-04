import { Component, OnInit } from '@angular/core';
import { ProdutoInfoService } from '../services/produto-info.service';
import { Produto } from '../models/produto';
import { ConfirmationService, MessageService } from 'primeng/primeng';
//import { Caracteristica } from '../models/caracteristica';

@Component({
	selector: 'app-produto-list',
	templateUrl: './produto-list.component.html',
	styleUrls: ['./produto-list.component.css']
})
export class ProdutoListComponent implements OnInit {

    produtoList: Produto[];
    produto: Produto;
    display: boolean = false;
	newRow: boolean = false;
	//caracteristicas: Caracteristica[];

    uploadedFiles: any[] = [];


    constructor(private produtoService: ProdutoInfoService,
        private confirmationService: ConfirmationService,
        private messageService: MessageService) {

    }

	ngOnInit() {
        this.getAllProdutos();
	}
	getAllProdutos() {
         this.produtoService.getAllProdutos().subscribe(
             data => {
				this.produtoList = data;
             }
         );
	}
	selectedProduto(prod: Produto) {
        this.produto = prod;
        this.display = true;
        this.newRow = false;
	}
	showDialogToAdd() {
		this.produto = new Produto();
		this.produto.caracteristicas = [];
		this.produto.unidades = [];
        this.display = true;
        this.newRow = true;
	}
	saveProduto() {

		let produtoList = [...this.produtoList];
		if (this.newRow)
	         produtoList.push(this.produto);
         else

         produtoList[this.produtoList.indexOf(this.produto)] = this.produto;
         this.produtoService.saveProdutos(this.produto).subscribe(
             data => {
               this.produto.id = data.id;
               console.log(data);
             }
         );
		this.produtoList = produtoList;
		this.produto = null;

        this.messageService.add({ severity: 'success', summary: 'Service Message', detail: 'Produto salvo com sucesso!' });
        this.display = false;
	}
	deleteProduto(prod: Produto) {
         this.confirmationService.confirm({
             message: 'Are you sure that you want to remove this Product?',
             accept: () => {

             this.produtoService.deleteProduto(prod.id).subscribe(
                     data => {
                          if (data.sucess) {
                            console.log(data);
                          }
                     }
                 );

                 this.produtoList = this.produtoList.filter(p => p !== prod);
                 this.messageService.add({ severity: 'success', summary: 'Service Message', detail: 'Produto deletado com sucesso!' });
          }
       });
    }

    cancelSaveProduto(){
        this.display = false;
    }
    addCaracteristica(){
	  //alert("event is: " +this.produto.codigo_barras);
	  //this.produto.caracteristicas.forEach(element => {
		  //alert("event is => "+ element.descricao);
	  //});
      this.produto.caracteristicas.push({id: null, descricao: ''});
	}
	addUnidades(){
      this.produto.unidades.push({id: null, nome: ''});
	}
    onUpload(event) {
         
         for (let file of event.files) {
          this.uploadedFiles.push(file);
          this.produto.imagem = event.files.getFileName;
         }
         this.messageService.add({ severity: 'info', summary: 'File Uploaded', detail: '' });
    }
}
