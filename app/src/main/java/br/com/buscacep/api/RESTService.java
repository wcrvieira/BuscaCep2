package br.com.buscacep.api;

/**
 * Importação da classe base Models
 */

import br.com.buscacep.models.Cep;

/**
 * Importação das classes do retrofit2, como chamadas das API,
 * Obtenção dos dados e caminho dos dados
 */
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface RESTService {

    /**
     * Utiliza o verbo HTPP Get para realizar a leitura dos dados da API
     * @param cep
     * @return
     */
    @GET("{cep}/json/")
    /**
     * Realiza a chamada da API passando o caminho dos dados para a string cep
      */
    Call<Cep> consultarCEP(@Path("cep") String cep);
}