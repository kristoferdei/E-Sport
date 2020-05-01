import net.rithms.riot.api.ApiConfig;
import net.rithms.riot.api.RiotApi;
import net.rithms.riot.api.RiotApiException;
import net.rithms.riot.api.endpoints.summoner.dto.Summoner;
import net.rithms.riot.constant.Platform;

public class Main {
    public static void main(String[] args) throws RiotApiException {

        ApiConfig config = new ApiConfig().setKey("RGAPI-58980dfc-1217-47a5-9b78-0bf798889504 ");

        RiotApi api = new RiotApi(config);

        Summoner summoner = api.getSummonerByName(Platform.EUNE, "kristoferdei98");

        System.out.println("Name: " + summoner.getName());
        System.out.println("Summoner ID: " + summoner.getId());
        System.out.println("Account ID: " + summoner.getAccountId());
        System.out.println("PUUID: " + summoner.getPuuid());
        System.out.println("Summoner Level: " + summoner.getSummonerLevel());
        System.out.println("Profile Icon ID: " + summoner.getProfileIconId());

    }
}