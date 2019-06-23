package domain;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String typeOfResults;
    private String rezults;

    @Override
    public String toString() {
        return "Results{" +
                "id=" + id +
                ", typeOfResults='" + typeOfResults + '\'' +
                ", rezults='" + rezults + '\'' +
                '}';
    }
}
