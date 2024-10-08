package br.edu.utfpr.pb.server.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String username;
    private String displayName;
    private String password;
}
