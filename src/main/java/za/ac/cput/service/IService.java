package za.ac.cput.service;

public interface IService <Object, ID>{
    Object create(Object obj);
    Object read(ID id);
    Object update(Object obj);

}
