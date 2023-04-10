package carracing.logic.repository;

import carracing.logic.domain.Record;
import carracing.logic.domain.Round;
import carracing.logic.domain.Score;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RoundRepository {
    private final Map<Round, List<Score>> roundToScoreListMap;
    private final Map<Round, Record> roundToRecordMap;

    public RoundRepository() {
        //Map<Round, List<Score>> roundToScoreListMap, Map<Round, Record> roundToRecordMap
        this.roundToScoreListMap = new HashMap<>();
        this.roundToRecordMap = new HashMap<>();
    }

    public List<Round> findAll() {
        return new ArrayList<>(roundToScoreListMap.keySet())
            .stream()
            .sorted()
            .collect(Collectors.toList());
    }

    public Map<Round, Record> roundToRecordMap() {
        return null;
    }
}
