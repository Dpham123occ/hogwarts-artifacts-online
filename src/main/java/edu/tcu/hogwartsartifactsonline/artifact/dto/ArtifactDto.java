package edu.tcu.hogwartsartifactsonline.artifact.dto;

import edu.tcu.hogwartsartifactsonline.wizard.dto.WizardDto;
import jakarta.validation.constraints.NotEmpty;

public record ArtifactDto(String id,
                          @NotEmpty(message = "name is required") String name,
                          @NotEmpty(message = "decription is required")
                          String description,
                          @NotEmpty(message = "imageUrl is required")
                          String imageUrl,
                          WizardDto owner) {



}
