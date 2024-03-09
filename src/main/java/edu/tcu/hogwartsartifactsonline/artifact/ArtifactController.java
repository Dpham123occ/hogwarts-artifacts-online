package edu.tcu.hogwartsartifactsonline.artifact;

import edu.tcu.hogwartsartifactsonline.system.StatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import edu.tcu.hogwartsartifactsonline.system.Result;

@RestController
public class ArtifactController {

    private final ArtifactService artifactService;

    public ArtifactController(ArtifactService artifactService) {
        this.artifactService = artifactService;
    }


    @GetMapping("/api/v1/artifacts/{artifactId}")
    public Result findArtifactById(@PathVariable String artifactId) {
        Artifact foundArtifact = this.artifactService.findById(artifactId);
        return new Result(true, StatusCode.SUCCESS, "Find One Success", foundArtifact);
    }

}
