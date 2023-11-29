package DonacionesWu.domain.mapping.dto;

import lombok.Builder;

@Builder
public record PersonDto(Integer idPerson,
                        String name,
                        String password,
                        String gmail) {

}
