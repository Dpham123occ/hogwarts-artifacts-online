package edu.tcu.hogwartsartifactsonline.artifact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository //optional
public interface ArtifactRepository extends JpaRepository<Artifact, String> {

}
