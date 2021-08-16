package com.example

import io.micronaut.data.annotation.Query
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import javax.persistence.Entity
import javax.persistence.Id


@Entity
class DemoEntity(
    @Id
    var id: Long,
)


@Repository
interface DemoRepository : JpaRepository<DemoEntity, Long> {
    @Query(
        nativeQuery = true,
        value = "SELECT id FROM (VALUES (1),(2),(4),(5)) AS t(id)"
    )
    fun demoQuery(): List<Long>
}