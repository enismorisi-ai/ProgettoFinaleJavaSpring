package it.aulab.progetto_finale.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Questa classe viene utilizzata come struttura per i dati che riceveremo dal form di register e login

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    @NotEmpty
    private String firstname;
    @NotEmpty
    private String lastname;
    @NotEmpty(message="Email should not be empty")
    @Email
    private String email;
    @NotEmpty(message="Password should not be empty")
    private String password;

    //per ora lascio questi getter altrimenti il mio codice va in errore. Tuttavia dovrebbe funzionare anche senza getter espliciti dato che sto usando la annotazione @Getter di lombok
    public String getFirstName(){
        return firstname;
    }
    
    public String getLastName(){
        return lastname;
    }
}
