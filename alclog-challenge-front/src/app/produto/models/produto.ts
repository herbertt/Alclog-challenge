import { Caracteristica } from './caracteristica';
import { Unidade } from './unidade';

export class Produto {
    id: number;
    codigo: string;
    nome: string;
    descricao: string;
    imagem: string;
    codigo_barras: string;
    caracteristicas: Caracteristica[];
    unidades: Unidade[];
}
