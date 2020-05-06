package team2_scrum4;

import javax.jws.WebService;


@WebService (targetNamespace="http://team2_scrum4/", serviceName="Team2_Horse_APIService", portName="Team2_Horse_APIPort")
public class Team2_Horse_APIDelegate{

    team2_scrum4.Team2_Horse_API _team2_Horse_API = null;

    public Team2_Horse createHorse (String inHorseName, String inTailLength, String inUniqueQuality, int inTimeFurlong) {
        return _team2_Horse_API.createHorse(inHorseName,inTailLength,inUniqueQuality,inTimeFurlong);
    }

    public Team2_Horse_APIDelegate() {
        _team2_Horse_API = new team2_scrum4.Team2_Horse_API(); }

}