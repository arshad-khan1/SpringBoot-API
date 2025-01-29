package com.pinnacle.ipl.match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MatchService {
	List<Match> matches = new ArrayList<>(Arrays.asList(
			new Match("m1", "3-11-2020", "Delhi", "t1", "t2", "t1"), 
			new Match("m2", "13-1-2023", "Mumbai", "t3", "t4", "t4"),
			new Match("m3", "23-12-2014", "Ahmedabad", "t5", "t6", "t5")
			));

	public List<Match> getAllMatches() {
		return matches;
	}

	public Match getMatch(String id) {
		return matches.stream()
				.filter(m -> id.equals(m.getMatchID()))
				.findFirst()
				.orElse(null);
	}

	public void addMatch(Match match) {
		matches.add(match);
	}

	public void deleteMatch(String id) {
		matches.removeIf(m -> m.getMatchID().equals(id));
	}

	public void updateMatch(String id, Match updatedMatch) {
		for (int i = 0; i < matches.size(); i++) {
			Match current = matches.get(i);
			if (current.getMatchID().equals(id)) {
				matches.set(i, updatedMatch);
				return;
			}
		}
	}
}
