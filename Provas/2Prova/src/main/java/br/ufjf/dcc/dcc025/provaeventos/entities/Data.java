package br.ufjf.dcc.dcc025.provaeventos.entities;

import br.ufjf.dcc.dcc025.provaeventos.exceptions.DataException;

/**
 *
 * @author ice
 */
public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;
    
    public Data(Integer dia, Integer mes, Integer ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data() {

    }
    
    public static Data parser(String dataString) throws DataException {
        try {
            String[] dataArray = dataString.split("/");
            int dia = Integer.parseInt(dataArray[0]);
            int mes = Integer.parseInt(dataArray[1]);
            int ano = Integer.parseInt(dataArray[2]);
            if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || String.valueOf(ano).length() != 4) {
                throw new DataException("Data inválida!");
            }
            return new Data(dia, mes, ano);
        } catch (NumberFormatException e) {
            throw new DataException("Formato de data inválido!");
        }
    }
    
    public Integer diferenca(Data data) {
        int diasThis = this.dia + this.mes * 30 + this.ano * 365;
        int diasData = data.dia + data.mes * 30 + data.ano * 365;
    return diasData - diasThis;
  }
}