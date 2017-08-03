package can.Service.impl;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import can.Service.PersonService;
import can.dao.PersonDao;

public class PersonServiceBean implements  PersonService {
	/* (non-Javadoc)
	 * @see can.Service.impl.PersonService#save()
	 */
	//不关心接口的实现类是谁
	private PersonDao personDao;
	private String name;
	private Integer id;
	
	private Set<String> sets=new HashSet<String>();
	private List<String> lists=new ArrayList<String>();
	private Properties properties=new Properties();
	private Map<String,String> maps=new HashMap<String,String>();
	
	
	
	
	
	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	public void save() {
		personDao.add();
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		

	}

	public PersonServiceBean(PersonDao personDao, String name) {
		 	  
		this.personDao = personDao;
		this.name = name;
	}

}
