package com.bbva.mensajeria.service;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Service;

import  com.bbva.mensajeria.model.EmailModel;
import  com.bbva.mensajeria.model.EmailSimpleModel;

/**
 * 
 * @author SantiagoTH
 *
 */

@Service
public class BuildEmailService {

	@Autowired
	private SendEmailService sendEmailService;

	@Autowired
	private EmailSimpleModel emailSimpleModel;

	public BuildEmailService() {

	}

	public void buildEmail(EmailModel emailModel)
			throws MailException, MessagingException, IOException, URISyntaxException {

		emailModel.setBody(getBodyQuemado().replace("<%BODY%>",emailModel.getBody()).replace("<%PUNTOS%>",emailModel.getPoints()));
		
		for (String email : emailModel.getReceiverEmail()) {
			emailSimpleModel.setReceiverEmail(email);
			emailSimpleModel.setBody(emailModel.getBody());
			emailSimpleModel.setSubject("Hackathon - BBVA Colombia");

			sendEmailService.buildEmail(emailSimpleModel);
		}

	}	
	
	private String getBodyQuemado() {
		return "<!DOCTYPE html\r\n" + 
				"    PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
				"<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n" + 
				"    <!--[if !mso]><!-->\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n" + 
				"    <!--<![endif]-->\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n" + 
				"    <style type=\"text/css\">\r\n" + 
				"        @media screen and (max-width: 425px) {\r\n" + 
				"\r\n" + 
				"            .two-column .column,\r\n" + 
				"            .three-column .column {\r\n" + 
				"                max-width: 100% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .two-column img {\r\n" + 
				"                max-width: 100% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .three-column .cta {\r\n" + 
				"                max-width: 100% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .three-column img {\r\n" + 
				"                max-width: 50% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .mobile {\r\n" + 
				"                font-size: 29px;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .secundaria-column .column {\r\n" + 
				"                max-width: 100% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .secundaria-column img {\r\n" + 
				"                max-width: 100% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .columnPR {\r\n" + 
				"                width: 425px;\r\n" + 
				"                max-width: 425px;\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        @media screen and (min-width: 426px) and (max-width: 767px) {\r\n" + 
				"            .three-column .column {\r\n" + 
				"                max-width: 80% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .three-column img {\r\n" + 
				"                max-width: 40% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .two-column .column {\r\n" + 
				"                max-width: 50% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .two-column img {\r\n" + 
				"                max-width: 70% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .three-column .cta {\r\n" + 
				"                max-width: 40% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .mobile {\r\n" + 
				"                font-size: 29px;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .secundaria-column .column {\r\n" + 
				"                max-width: 50% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .secundaria-column img {\r\n" + 
				"                max-width: 100% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .columnPR {\r\n" + 
				"                width: 300px;\r\n" + 
				"                max-width: 300px;\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        @media screen and (min-width: 768px) {\r\n" + 
				"            .three-column .column {\r\n" + 
				"                max-width: 33% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .two-column .column {\r\n" + 
				"                max-width: 25% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .mobile {\r\n" + 
				"                font-size: 29px;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .secundaria-column .column {\r\n" + 
				"                max-width: 50% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .three-column .cta {\r\n" + 
				"                max-width: 33% !important;\r\n" + 
				"            }\r\n" + 
				"\r\n" + 
				"            .columnPR {\r\n" + 
				"                width: 300px;\r\n" + 
				"                max-width: 300px;\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .responsive {\r\n" + 
				"            width: 100%;\r\n" + 
				"            height: auto;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        ul li {\r\n" + 
				"            list-style-type: square;\r\n" + 
				"            list-style-image: url(\"images/icono_inscripcion.png\");\r\n" + 
				"        }\r\n" + 
				"    </style>\r\n" + 
				"    <!--[if (gte mso 9)|(IE)]>\r\n" + 
				"	<style type=\"text/css\">\r\n" + 
				"		table {border-collapse: collapse !important;}\r\n" + 
				"	</style>\r\n" + 
				"	<![endif]-->\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body\r\n" + 
				"    style=\"margin-top:0 !important;margin-right:0 !important;margin-bottom:0 !important;margin-left:0 !important;padding-top:0;padding-right:0;padding-bottom:0;padding-left:0;background-color:#ffffff;\">\r\n" + 
				"    <center style=\"width:100%;table-layout:fixed;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;\">\r\n" + 
				"        <div\r\n" + 
				"            style=\"max-width:600px;margin-top:0;margin-right:auto;margin-bottom:0;margin-left:auto;background-color:#ffffff;\">\r\n" + 
				"            <!--[if (gte mso 9)|(IE)]>\r\n" + 
				"			<table width=\"600\" align=\"center\" style=\"border-spacing:0;\" >\r\n" + 
				"			<tr>\r\n" + 
				"			<td style=\"padding-top:0;padding-right:0;padding-bottom:0;padding-left:0;\" >\r\n" + 
				"			<![endif]-->\r\n" + 
				"            <table align=\"center\"\r\n" + 
				"                style=\"border-spacing:0;Margin:0 auto;width:100%;max-width:600px;background-color:#ffffff;\">\r\n" + 
				"\r\n" + 
				"                <!-- INICIO TEXTO LEGAL -->\r\n" + 
				"                <tr>\r\n" + 
				"                    <td style=\"padding-top:0;padding-right:0;padding-bottom:0;padding-left:0;\">\r\n" + 
				"                        <table width=\"100%\" style=\"border-spacing:0;\">\r\n" + 
				"                            <tr>\r\n" + 
				"                                <td\r\n" + 
				"                                    style=\"padding-top:10px;padding-right:10px;padding-bottom:10px;padding-left:10px;text-align:center;\">\r\n" + 
				"                                    <p\r\n" + 
				"                                        style=\"Margin-bottom:10px;font-family:Arial;font-size:11px;color:#999999;text-align:center;\">\r\n" + 
				"                                        Si no puedes ver este correo\r\n" + 
				"                                        <a href=\"#\" target=\"_blank\" border=\"0\"\r\n" + 
				"                                            style=\"text-decoration:underline;font-size:11px;color:#999999;\">\r\n" + 
				"                                            haz clic aqu&iacute;\r\n" + 
				"                                        </a></p>\r\n" + 
				"                                </td>\r\n" + 
				"                            </tr>\r\n" + 
				"                        </table>\r\n" + 
				"                    </td>\r\n" + 
				"                </tr>\r\n" + 
				"                <!-- FIN TEXTO LEGAL -->\r\n" + 
				"\r\n" + 
				"                <!-- INICIO IMAGEN PRINCIPAL -->\r\n" + 
				"\r\n" + 
				"                <tr style=\"background-color:#142649;\">\r\n" + 
				"                    <td class=\"two-column\"\r\n" + 
				"                        style=\"padding-top:0px;padding-right:0;padding-bottom:0px;padding-left:0;text-align:center;font-size:0;vertical-align:middle;\">\r\n" + 
				"                        <div class=\"columnPR\" style=\"display:inline-block;vertical-align:top;\">\r\n" + 
				"                            <table width=\"100%\" style=\"border-spacing:0;\">\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <td style=\"padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;\">\r\n" + 
				"\r\n" + 
				"                                        <!-- INICIO DESCUENTO 2 -->\r\n" + 
				"                                        <table style=\"border-spacing:0;width:100%;\">\r\n" + 
				"                                            <tr>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"padding-top:20px;padding-right:20px;padding-bottom:0px;padding-left:20px;background-color:#142649;\">\r\n" + 
				"                                                    <p\r\n" + 
				"                                                        style=\"margin-top:0px;margin-right:10px;margin-bottom:0px;margin-left:10px;font-family:Arial;font-size:15px;color:#ffffff;text-align:left;\">\r\n" + 
				"                                                        <img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/f43d0d16-5282-4c1a-ae61-c152fb5ca35a.png\" width=\"122px\" height=\"38px\"\r\n" + 
				"                                                            alt=\"\"></p>\r\n" + 
				"                                                    <p\r\n" + 
				"                                                        style=\"margin-top:30px;margin-right:10px;margin-bottom:0px;margin-left:10px;font-family:Arial;font-size:40px;color:#ffffff;text-align:left;font-weight: bold;\">\r\n" + 
				"                                                        Estimado cliente</p>\r\n" + 
				"                                                    <p\r\n" + 
				"                                                        style=\"margin-top:10px;margin-right:10px;margin-bottom:0px;margin-left:10px;font-family:Arial;font-size:38px;color:#029A9A;text-align:left;font-weight: bold;line-height: 34px;\">\r\n" + 
				"                                                </td>\r\n" + 
				"\r\n" + 
				"                                            </tr>\r\n" + 
				"                                        </table>\r\n" + 
				"\r\n" + 
				"                                    </td>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </table>\r\n" + 
				"                        </div>\r\n" + 
				"                        <div class=\"columnPR\" style=\"display:inline-block;vertical-align:middle;\">\r\n" + 
				"                            <img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/5952f017-df96-4612-9d26-7acb08b1856b.png\" width=\"300px\" height=\"300px\" class=\"responsive\" alt=\"\">\r\n" + 
				"                        </div>\r\n" + 
				"                    </td>\r\n" + 
				"                </tr>\r\n" + 
				"                <!-- FIN IMAGEN PRINCIPAL -->\r\n" + 
				"\r\n" + 
				"                <!-- Info Transacci&oacute;n -->\r\n" + 
				"                <tr style=\"background-color:#ffffff;\">\r\n" + 
				"                    <td class=\"two-column\"\r\n" + 
				"                        style=\"padding-top:25px;padding-right:0;padding-bottom:25px;padding-left:0;text-align:center;font-size:0;vertical-align:middle;\">\r\n" + 
				"                        <p style=\"margin-top:0px;margin-right:10px;margin-bottom:20px;margin-left:10px;font-family:Arial;font-size:16px;color:#142649;text-align:center;\">\r\n" + 
				"                            <b><%BODY%></b>\r\n" + 
				"							<b>Número de puntos: <%PUNTOS%></b>\r\n" + 
				"						</p>\r\n" + 
				"							\r\n" + 
				"                        </td>\r\n" + 
				"                </tr>\r\n" + 
				"                <!-- End info-->\r\n" + 
				"                <tr style=\"background-color:#E8E8E8;\">\r\n" + 
				"                    <td>\r\n" + 
				"                        <p\r\n" + 
				"                            style=\"font-family:Arial;color:#142649;text-align:center;font-size:13px;padding:30px 30px 30px 30px;\">\r\n" + 
				"                            Si no eres el destinatario de este mensaje, por favor comun&iacute;cate con nosotros con el fin de\r\n" + 
				"                            realizar la actualizaci&oacute;n correspondiente en los siguientes tel&eacute;fonos:<br><br><span style=\"font-family:Arial;color:#142649;font-weight: bold;\">Bogot&aacute;: 401 00 00 Barranquilla: 350 35 00 Cali: 889 20 20 Medell&iacute;n: 493 83 00 Bucaramanga: 630 40 00 Resto del Pa&iacute;s: 01 8000 912227</span>\r\n" + 
				"                        </p>\r\n" + 
				"                    </td>\r\n" + 
				"                </tr>\r\n" + 
				"\r\n" + 
				"                <!-- INICIO ICONOS REDES SOCIALES -->\r\n" + 
				"                <tr>\r\n" + 
				"                    <td class=\"three-column\"\r\n" + 
				"                        style=\"padding-top:35px;padding-right:0;padding-bottom:22px;padding-left:0;text-align:center;font-size:0;background-color:#3E79A9;\">\r\n" + 
				"                        <!--[if (gte mso 9)|(IE)]>\r\n" + 
				"						</td><td width=\"200\" valign=\"top\" style=\"padding-top:0;padding-right:0;padding-bottom:0;padding-left:0;\" >\r\n" + 
				"                        <![endif]-->\r\n" + 
				"                        <div><span\r\n" + 
				"                                style=\"text-align: center; color:#ffffff; font-size:12px; margin-top: 20px; font-family:Arial;\">Estemos\r\n" + 
				"                                conectados</span></div>\r\n" + 
				"                        <div class=\"column\" style=\"width:100%;max-width:300px;display:inline-block;vertical-align:top;\">\r\n" + 
				"                            <table width=\"100%\" style=\"border-spacing:0;\">\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <td\r\n" + 
				"                                        style=\"padding-top:10px;padding-right:10px;padding-bottom:10px;padding-left:10px;\">\r\n" + 
				"                                        <table style=\"border-spacing:0;width:100%;text-align:center;\">\r\n" + 
				"                                            <tr>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"padding-top:10px;padding-right:10px;padding-bottom:10px;padding-left:10px;\">\r\n" + 
				"                                                    <a href=\"https://www.facebook.com/bbvaencolombia\" target=\"_blank\"\r\n" + 
				"                                                        border=\"0\" style=\"text-decoration:none;\">\r\n" + 
				"                                                        <img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/d4586f49-5d71-4fe6-9fb5-4f3044e5f58b.png\" width=\"27\"\r\n" + 
				"                                                            alt=\"Facebook /BBVACol\" border=\"0\"\r\n" + 
				"                                                            style=\"width:100%;max-width:25px;height:auto;\" />\r\n" + 
				"                                                    </a>\r\n" + 
				"                                                </td>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"padding-top:10px;padding-right:10px;padding-bottom:10px;padding-left:10px;\">\r\n" + 
				"                                                    <a href=\"https://twitter.com/BBVA_Colombia\" target=\"_blank\"\r\n" + 
				"                                                        border=\"0\" style=\"text-decoration:none;\">\r\n" + 
				"                                                        <img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/66c077fb-5182-47fa-bc19-9659f1707158.png\" width=\"27\"\r\n" + 
				"                                                            alt=\"Twitter @BBVA_Colombia\" border=\"0\"\r\n" + 
				"                                                            style=\"width:100%;max-width:25px;height:auto;\" />\r\n" + 
				"                                                    </a>\r\n" + 
				"                                                </td>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"padding-top:10px;padding-right:10px;padding-bottom:10px;padding-left:10px;\">\r\n" + 
				"                                                    <a href=\"https://www.linkedin.com/company/bbva-colombia\"\r\n" + 
				"                                                        target=\"_blank\" border=\"0\" style=\"text-decoration:none;\">\r\n" + 
				"                                                        <img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/f7bf3c61-49f1-448f-8d00-201899ad9afc.png\" width=\"27\"\r\n" + 
				"                                                            alt=\"LinkedIn BBVA Colombia\" border=\"0\"\r\n" + 
				"                                                            style=\"width:100%;max-width:25px;height:auto;\" />\r\n" + 
				"                                                    </a>\r\n" + 
				"                                                </td>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"padding-top:10px;padding-right:10px;padding-bottom:10px;padding-left:10px;\">\r\n" + 
				"                                                    <a href=\"https://www.youtube.com/BBVAenColombia\"\r\n" + 
				"                                                        target=\"_blank\" border=\"0\" style=\"text-decoration:none;\">\r\n" + 
				"                                                        <img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/ccaf095b-ab87-4942-b513-369667878636.png\" width=\"27\"\r\n" + 
				"                                                            alt=\"YouTube BancoBBVAColombia\" border=\"0\"\r\n" + 
				"                                                            style=\"width:100%;max-width:25px;height:auto;\" />\r\n" + 
				"                                                    </a>\r\n" + 
				"                                                </td>\r\n" + 
				"                                            </tr>\r\n" + 
				"                                        </table>\r\n" + 
				"                                    </td>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </table>\r\n" + 
				"                        </div>\r\n" + 
				"                        <!--[if (gte mso 9)|(IE)]>\r\n" + 
				"						</td>\r\n" + 
				"						</tr>\r\n" + 
				"						</table>\r\n" + 
				"						<![endif]-->\r\n" + 
				"                    </td>\r\n" + 
				"                </tr>\r\n" + 
				"                <!-- FIN ICONOS REDES SOCIALES -->\r\n" + 
				"\r\n" + 
				"                <!-- CONTACT INFO-->\r\n" + 
				"                <tr style=\"background-color:#1A447D;\">\r\n" + 
				"                    <td class=\"two-column\"\r\n" + 
				"                        style=\"padding-top:25px;padding-right:0;padding-bottom:25px;padding-left:0;text-align:center;font-size:0;vertical-align:middle;\">\r\n" + 
				"                        <div class=\"columnPR\"\r\n" + 
				"                            style=\"width:100%;max-width:300px;display:inline-block;vertical-align:middle;\">\r\n" + 
				"                            <table width=\"100%\" style=\"border-spacing:0;\">\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <td style=\"padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;\">\r\n" + 
				"                                        <!-- contacto 01 -->\r\n" + 
				"                                        <table style=\"border-spacing:0;width:80%;margin-left: 40px;\">\r\n" + 
				"                                            <tr>\r\n" + 
				"                                                <td style=\"\"><img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/4a3bef07-5cb9-4d7b-b9a6-3158e7964380.png\" width=\"21px\" height=\"21px\"\r\n" + 
				"                                                        alt=\"\"></td>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"font-family: Arial, Helvetica, sans-serif;color: #ffffff; font-size: 14px; text-align: left;\">\r\n" + 
				"                                                    L&iacute;nea BBVA 01 8000 912227</td>\r\n" + 
				"                                            </tr>\r\n" + 
				"                                        </table>\r\n" + 
				"                                    </td>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </table>\r\n" + 
				"                        </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                        <div class=\"columnPR\"\r\n" + 
				"                            style=\"width:100%;max-width:300px;display:inline-block;vertical-align:middle;\">\r\n" + 
				"                            <table width=\"100%\" style=\"border-spacing:0;\">\r\n" + 
				"                                <tr>\r\n" + 
				"                                    <td style=\"padding-top:0px;padding-right:0px;padding-bottom:0px;padding-left:0px;\">\r\n" + 
				"                                        <!-- contacto 02 -->\r\n" + 
				"                                        <table style=\"border-spacing:0;width:80%;margin-left: 40px;\">\r\n" + 
				"                                            <tr>\r\n" + 
				"                                                <td style=\"\"><img src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/839f172f-21b2-44a2-8101-fd2936743364.png\" width=\"21px\" height=\"21px\"\r\n" + 
				"                                                        alt=\"\"></td>\r\n" + 
				"                                                <td\r\n" + 
				"                                                    style=\"font-family: Arial, Helvetica, sans-serif;color: #ffffff; font-size: 14px; text-align: left;\">\r\n" + 
				"                                                    <a href=\"https://www.bbva.com.co\" style=\"color:#FFFFFF;\">Entra a www.bbva.com.co</a>\r\n" + 
				"                                                </td>\r\n" + 
				"                                            </tr>\r\n" + 
				"                                        </table>\r\n" + 
				"                                    </td>\r\n" + 
				"                                </tr>\r\n" + 
				"                            </table>\r\n" + 
				"                        </div>\r\n" + 
				"                    </td>\r\n" + 
				"                </tr>\r\n" + 
				"                <!-- CONTACT INFO-->\r\n" + 
				"\r\n" + 
				"                <!-- INICIO IMAGEN CIERRE BBVA -->\r\n" + 
				"                <tr style=\"background-color:#072146;\">\r\n" + 
				"                    <td style=\"padding-top:0;padding-right:0;padding-bottom:0;padding-left:0;\"><img\r\n" + 
				"                            src=\"http://image.email.bbva.com.co/lib/fe4515707564047c7d1470/m/5/e6b275f9-d5eb-4381-88c8-9e454689afc8.jpg\" width=\"600px\" height=\"181px\" alt=\"BBVA adelante.\" border=\"0\"\r\n" + 
				"                            style=\"width:100%;max-width:600px;height:auto;display:block;\" />\r\n" + 
				"                    </td>\r\n" + 
				"                </tr>\r\n" + 
				"\r\n" + 
				"                <!-- FIN IMAGEN CIERRE BBVA -->\r\n" + 
				"\r\n" + 
				"            </table>\r\n" + 
				"            <!--[if (gte mso 9)|(IE)]>\r\n" + 
				"			</td>\r\n" + 
				"			</tr>\r\n" + 
				"			</table>\r\n" + 
				"			<![endif]-->\r\n" + 
				"        </div>\r\n" + 
				"    </center>\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>";
	}

}
