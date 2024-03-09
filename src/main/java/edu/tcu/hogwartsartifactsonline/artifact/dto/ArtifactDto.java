package edu.tcu.hogwartsartifactsonline.artifact.dto;

import edu.tcu.hogwartsartifactsonline.wizard.dto.WizardDto;

public record ArtifactDto(String id,
                          String name,
                          String description,
                          String imageUrl,
                          WizardDto owner) {



}
