package com.lem45.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.lem45.model.Revision;
import com.lem45.util.ConectorBD;

public class RevisionDao {
    private Connection connection = ConectorBD.getConection();

    public RevisionDao() {
    }

    public void addRevision(Revision revision) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("INSERT INTO reviciones (codigo, filtro, aceite, frenos, matricula) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2, revision.getFiltro());
            preparedStatement.setString(3, revision.getAceite());
            preparedStatement.setString(4, revision.getFrenos());
            preparedStatement.setString(5, revision.getMatricula());
            preparedStatement.executeUpdate();
            System.out.println(revision + " fue registrada!");
        } catch (SQLException var3) {
            System.out.println("Error al registrar la revisión: " + var3.getMessage());
        }

    }

    public void updateRevision(Revision revision) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("UPDATE reviciones SET codigo=?, filtro=?, aceite=?, frenos=?, matricula=? WHERE codigo=?");
            preparedStatement.setString(1, revision.getCodigo());
            preparedStatement.setString(2, revision.getFiltro());
            preparedStatement.setString(3, revision.getAceite());
            preparedStatement.setString(4, revision.getFrenos());
            preparedStatement.setString(5, revision.getMatricula());
            preparedStatement.setString(6, revision.getCodigo());
            preparedStatement.executeUpdate();
            System.out.println(revision + " fue editada!");
        } catch (SQLException var3) {
            System.out.println("Error al editar la revisión : " + var3.getMessage());
        }

    }

    public void deleteRevision(String codigo) {
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement("DELETE FROM reviciones WHERE codigo=?");
            preparedStatement.setString(1, codigo);
            preparedStatement.executeUpdate();
            System.out.println(codigo + " eliminada!");
        } catch (SQLException var3) {
            System.out.println("Error al borrar la revisión: " + var3.getMessage());
        }

    }

    public List<Revision> getAllRevisiones() {
        List<Revision> revisiones = new ArrayList();

        try {
            Statement statement = this.connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM reviciones");

            while(resultSet.next()) {
                Revision revision = new Revision();
                revision.setCodigo(resultSet.getString("codigo"));
                revision.setFiltro(resultSet.getString("filtro"));
                revision.setAceite(resultSet.getString("aceite"));
                revision.setFrenos(resultSet.getString("frenos"));
                revision.setMatricula(resultSet.getString("matricula"));
                revisiones.add(revision);
            }
        } catch (SQLException var5) {
            System.out.println("Error al Listar las revisiones: " + var5.getMessage());
        }

        return revisiones;
    }
}