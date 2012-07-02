/**
 * 
 */
package de.piratech.mapimap.service;

import java.util.List;

import de.piratech.mapimap.data.Crew;
import de.piratech.mapimap.data.Squad;

/**
 * @author maria
 * 
 */
public interface DataSource {

	public List<Crew> getCrews();

	public void addCrew(Crew newCrew);

	public void delete(Crew crew);

	public List<Squad> getSquads();

	public void addSquad(Crew newSquad);

	public void delete(Squad squad);
}