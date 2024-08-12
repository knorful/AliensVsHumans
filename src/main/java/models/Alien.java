package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Alien extends Entity{
    public enum AlienRace {
        MARTIAN,
        VENUSIAN,
        JUPITERIAN
    }
    private Boolean isMutated;
    private AlienRace race;
}
