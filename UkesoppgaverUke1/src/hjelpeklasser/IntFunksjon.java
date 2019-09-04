package hjelpeklasser;

@FunctionalInterface
public interface IntFunksjon<T>    // T for argumenttype, R for returtype
{
    int anvend(T t);
}