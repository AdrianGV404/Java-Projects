package metodos;

public class Web {
    //intentar obtener el puuid del usuario (segun el nombre de usuario del lol (inversitgarlo)), no se si es el de login o el ingame
    //cuanto tenga el puuid, mirar si con eso puedo sacar el matchid (que esta jugando ahora)
    //una vez tengo el matchID puedo sacar toda la info que quiera
    String myPuuid = "https://developer.riotgames.com/apis#summoner-v4/GET_getBySummonerName";
    String link = "https://developer.riotgames.com/apis#tft-match-v1/GET_getMatchIdsByPUUID";

    //se accede a myPuuid y se mete el nombre del usuario
    String id ="MPBIRhu0KI8n6z1XhOZ0wE4MmtV5Wu__KaPzF9GXkv7wNeM";
    String accountId ="Xaww2-0TVyA02hxT5sshOJ_TLJD11K_CgURh2fLTN1-RLIU";
    String puuid = "4GQpCkBkJMSvKE4rytY9CJoqoHv8QtdE_rSTYla2HUXA1NzXCOChtNr5FPPT-1V6tu3diCcxaTFdGg";

    String ultimo_game_tft ="EUW1_6481596977";

    //hay que hacerlo dinamico (con overlay, y meter los inputs a mano, o usar un reconociemiento por pixels, pero me da a mi que no)
}
