import java.util.Map;
import java.util.Objects;

public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices;

    public Map<Vertex<T>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    public T getData() {
        return data;
    }

    public void setAdjacentVertices(Map<Vertex<T>, Double> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return Objects.equals(data, vertex.data) && Objects.equals(adjacentVertices, vertex.adjacentVertices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, adjacentVertices);
    }
}