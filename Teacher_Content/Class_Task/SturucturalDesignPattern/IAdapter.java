package structural_design_patterns.adapter;

public interface IAdapter<T> {
    XML convert(T file);
}
