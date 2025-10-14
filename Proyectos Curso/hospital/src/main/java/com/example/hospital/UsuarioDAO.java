package com.example.hospital;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;
import com.mongodb.client.MongoDatabase;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private final MongoCollection<Document> coleccion;

    public UsuarioDAO() {
        MongoDatabase db = ConexionMongo.obtenerBaseDatos();
        coleccion = db.getCollection("usuarios");
    }

    public void crearUsuario(Usuario usuario) {
        Document doc = new Document("nombre", usuario.getNombre())
                .append("edad", usuario.getEdad());
        coleccion.insertOne(doc);
        System.out.println("Usuario creado con ID: " + doc.getObjectId("_id"));
    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        for (Document doc : coleccion.find()) {
            lista.add(new Usuario(
                    doc.getObjectId("_id").toHexString(),
                    doc.getString("nombre"),
                    doc.getInteger("edad")
            ));
        }
        return lista;
    }

    public void actualizarUsuario(String id, String nuevoNombre, int nuevaEdad) {
        coleccion.updateOne(
                new Document("_id", new ObjectId(id)),
                new Document("$set", new Document("nombre", nuevoNombre).append("edad", nuevaEdad))
        );
        System.out.println("Usuario actualizado.");
    }

    public void eliminarUsuario(String id) {
        coleccion.deleteOne(new Document("_id", new ObjectId(id)));
        System.out.println("Usuario eliminado.");
    }

    public ResponseEntity<Document> buscarUsuario (String id){
    Document documento = coleccion.find(Filters.eq("_id", new ObjectId(id))).first();
        if (documento == null) {
        return ResponseEntity.notFound().build();
    }
        return ResponseEntity.ok(documento);
}


}