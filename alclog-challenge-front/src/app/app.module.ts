import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { PanelModule, InputMaskModule, ButtonModule, InputTextModule, ConfirmDialogModule, ConfirmationService, MessageService, InputTextareaModule, FileUploadModule, ScrollPanelModule} from 'primeng/primeng';

import { FooterComponent } from './footer/footer.component';

import { TableModule } from 'primeng/table';
import { ToastModule } from 'primeng/toast';

import { MenubarModule } from 'primeng/menubar';
import { HeaderComponent } from './header/header.component';
import { DialogModule } from 'primeng/dialog';
import { ProdutoListComponent } from './produto/produto-list/produto-list.component';
import { ProdutoInfoService } from './produto/services/produto-info.service';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { ToastComponent } from './message/toast/toast.component';
import { UnidadeInfoComponent } from './unidade/unidade-info/unidade-info.component';
import { CaracteristicasInfoComponent } from './caracteristicas/caracteristicas-info/caracteristicas-info.component';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaderComponent,
    ProdutoListComponent,
    ToastComponent,
    UnidadeInfoComponent,
    CaracteristicasInfoComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, ButtonModule, FormsModule, ScrollPanelModule,
    BrowserAnimationsModule, MenubarModule, InputTextareaModule, InputTextModule,
    PanelModule, TableModule, ToastModule, DialogModule, FileUploadModule,
    InputMaskModule, ToastModule, ConfirmDialogModule, CommonModule
  ],
  providers: [ProdutoInfoService, ConfirmationService, MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }

