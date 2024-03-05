package org.fogbeam.template.spring.spring_boot_web_jpa.domain.repository;

import org.fogbeam.template.spring.spring_boot_web_jpa.domain.entity.Sample;
import org.springframework.data.repository.CrudRepository;

public interface SampleRepository extends CrudRepository<Sample, Long>
{
}
