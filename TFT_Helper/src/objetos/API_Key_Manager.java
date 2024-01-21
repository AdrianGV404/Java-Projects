package objetos;

public class API_Key_Manager {
    //String key = API_Key.getAPI_Key();
    final int request_2_min = 100;
    final int request_min = 50;
    final int request_per_sec = 20;

    int request_min_done = request_min;
    int request_per_sec_done = request_min;
    int time_since_request = 0;
    //GITIGNORE
    //metodo para obtener datos (que actualice los cooldowns de tiempo y tal)
}
