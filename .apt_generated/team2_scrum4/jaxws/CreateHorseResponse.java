//
// Generated By:JAX-WS RI 2.2.10 (JAXB RI IBM IBM 2.2.10-06/29/2016 1:04:38 PMforeman-)
//


package team2_scrum4.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createHorseResponse", namespace = "http://team2_scrum4/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createHorseResponse", namespace = "http://team2_scrum4/")
public class CreateHorseResponse {

    @XmlElement(name = "return", namespace = "")
    private team2_scrum4.Team2_Horse _return;

    /**
     * 
     * @return
     *     returns Team2_Horse
     */
    public team2_scrum4.Team2_Horse getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(team2_scrum4.Team2_Horse _return) {
        this._return = _return;
    }

}
