package za.ac.cput.repository;

public interface IRepository <Object, ID> {

    Object create (Object object);
    Object read(ID key);
    Object update(Object object);
}
