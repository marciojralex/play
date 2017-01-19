package controllers;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;

import models.Mensagem;
import play.mvc.*;
import play.mvc.Controller;
import utils.DataBase;
import utils.JsonUtils;

/**
 * classe responsavel pelas action do /mensagem
 */
public class MensagemController extends Controller {

	DataBase dataBase = new DataBase();

	@Inject
	public MensagemController() {

	}

	/**
	 * metodo responsavel pela action do /mensagem/enviar
	 * @return http Result com 200 se a mensagem foi salva ou 400 se o request
	 * estiver errado
	 */
	public Result enviar() {
		Mensagem message = getMessageFromRequest();
		if (message != null) {
			return ok("mensagen enviada");
		} else {
			return badRequest("mensagem nula");
		}
	}

	/**
	 * metodo responsavel pela action do /mensagem/receber
	 * @return http Result com 200 e a mensagem no body do request
	 */
	public Result receber() {
		return ok(new Gson().toJson(dataBase.getMessage()));
	}

	/**
	 * metodo responsavel pela action do /mensagem/receber
	 * @return http Result com 200 e a mensagem no body do request
	 */
	public Result receberMensagens() {
		return ok(dataBase.getMessage().toString());
	}
	
	/**
	 * metodo para deserializar o request para um objeto
	 * @return um objeto do tipo Message
	 */
	private Mensagem getMessageFromRequest() {
		JsonNode jsonBody = request().body().asJson();
		Mensagem message = null;
		try {
			message = JsonUtils.fromJson(jsonBody, Mensagem.class);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return message;
	}
}
