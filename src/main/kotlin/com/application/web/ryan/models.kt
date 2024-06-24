import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

    @Entity
    class Book {
        @Id
        @GeneratedValue
        protected val id: Long? = null
        protected val name: String? = null

        // standard constructors

        // standard getters and setters
    }