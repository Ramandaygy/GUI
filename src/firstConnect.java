import java.io.IOException;
import java.net.URL;

public class firstConnect {
    public static void main(String[] args) throws IOException {
        ConnectGUI koneksisaya =new ConnectGUI();
        URL myAddress = koneksisaya.buildURL
                ("https://farmasi.mimoapps.xyz/mimoqss2auyqD1EAlkgZCOhiffSsFl6QqAEIGtM");
        String response = koneksisaya.getResponseFromHttpUrl(myAddress);
        System.out.println(response);
        //decoding Json
        assert response != null;
        JSONArray reponseJSON = new JSONArray(response);
        ArrayList<responseData> responseData =
                new ArrayList<>();
        for(int i=0;1< responseJSON.length();i++){
            ResponseData resData = new ResponseData();
            JSONObject myJSONObject =
                    reponseJSON.getJSONObject(i);
            resData.setNamaBarang(myJSONObject.getString("Nama Barang"));
            resData.setStock(myJSONObject.getString("Stock"));
            resData.setHargaBarang(myJSONObject.getString("Harga Barang"));
            responseData.add(resData);
        }


    }

}