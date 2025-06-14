package procedure03.problem05;

import procedure03.problem05.entity.SolarStone;
import procedure03.problem05.entity.Sorcerer;
import procedure03.problem05.entity.WaterMirror;
import procedure03.problem05.entity.WindAmulet;

public class BiodomeFamily05 {
    public static void main(String[] args) {
        Sorcerer wizard = new Sorcerer("아리엘");
        SolarStone solarStone = new SolarStone();
        WaterMirror waterMirror = new WaterMirror();
        WindAmulet windAmulet = new WindAmulet();

        System.out.println();
        wizard.addArtifact(solarStone);
        wizard.addArtifact(windAmulet);
        wizard.addArtifact(waterMirror);


        System.out.println();
        wizard.ability(solarStone);

        System.out.println();
        wizard.use(waterMirror);


    }

}
