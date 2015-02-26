package javastrava.api.v3.model;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * {@link StravaSegment} leaderboard
 * </p>
 * 
 * @author Dan Shannon
 *
 */
@Data
@EqualsAndHashCode
@NoArgsConstructor
public class StravaSegmentLeaderboard {
	private Integer entryCount;
	private Integer effortCount;
	private Integer neighborhoodCount;
	private String komType;
	/**
	 * The entries that were actually asked for
	 */
	private List<StravaSegmentLeaderboardEntry> entries;
	/**
	 * The entries relative to the athlete
	 */
	private List<StravaSegmentLeaderboardEntry> athleteEntries;
}