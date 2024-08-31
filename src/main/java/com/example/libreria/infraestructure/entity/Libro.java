    package com.example.libreria.infraestructure.entity;

    import jakarta.persistence.*;

    @Entity
    @Table(name = "libros")
    public class Libro {
        
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_libro")
        private Integer idLibro;

        @Column(name = "titulo", nullable = false)
        private String titulo;

        @ManyToOne
        @JoinColumn(name = "id_autor", nullable = false)
        private Autor autor;

        @Column(name = "año_publicacion")
        private String añoPublicacion;

        @Column(name = "precio")
        private double precio;

        // Getters y Setters

        public Integer getIdLibro() {
            return idLibro;
        }

        public void setIdLibro(Integer idLibro) {
            this.idLibro = idLibro;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Autor getAutor() {
            return autor;
        }

        public void setAutor(Autor autor) {
            this.autor = autor;
        }

        public String getAñoPublicacion() {
            return añoPublicacion;
        }

        public void setAñoPublicacion(String añoPublicacion) {
            this.añoPublicacion = añoPublicacion;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }
    }
