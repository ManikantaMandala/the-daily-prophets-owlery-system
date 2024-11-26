package org.theleakycauldron.prophetsowlerysystem.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ChangePasswordLinkDto {
    private String token;
    private String email;
}
