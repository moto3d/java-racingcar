package carracing.race.logic;

import carracing.race.logic.type.Round;
import carracing.race.logic.type.Score;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AutomobileFederation {

    private final Map<Round, List<Score>> raceResults;
    private final Map<Round, List<String>> scoreboard;
            //scoreboard

    public AutomobileFederation(Map<Round, List<Score>> raceResults) {
        this.raceResults = raceResults;
        this.scoreboard = scoreboardCalculation(raceResults);

    }

    private Map<Round, List<String>> scoreboardCalculation(Map<Round, List<Score>> raceResults) {

        for (Round round : getRounds()) {
            for (Score scoreCurrentCar : raceResults.get(round)) {

            }
        }
        return null;
    }

    public Map<Round, List<String>> getScoreboard() {
        return scoreboard;
    }

    public List<Integer> getIntRounds() {
        return raceResults
                .keySet()
                .stream()
                .map(Round::toInt)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public List<Round> getRounds() {
        return new ArrayList<>(raceResults.keySet()).stream().sorted().collect(Collectors.toList());
    }

    public List<String> lapSituations(Round round) {
        throw new RuntimeException();
        //return null;
    }
}
