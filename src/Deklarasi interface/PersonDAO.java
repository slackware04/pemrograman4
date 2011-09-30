public interface PersonDAO
{
	void save(Person p);
	void delete(Person p);
	Person getById(Long id);

}
