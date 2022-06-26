package colegio.vistas;

import colegio.modelo.Alumno;
import colegio.modelo.Materia;
import java.util.HashSet;

/**
 * @author Grupo 6
 * Fernandez Valentina
 * Romero Jorge
 * Gutierrez Manuel
 */
public class FormularioInscripcion extends javax.swing.JInternalFrame {
    private HashSet<Alumno> todosLosAlumnos;
    private HashSet<Materia> todasLasMaterias;
    
    /**
     * Creates new form FormularioInscripcion
     * @param todosLosAlumnos es el conjunto donde estan todos los alumnos registrados
     * @param todasLasMaterias es el conjunto donde estan todas las materias del colegio
     */
    public FormularioInscripcion(HashSet<Alumno> todosLosAlumnos, HashSet<Materia> todasLasMaterias) {
        initComponents();
        this.todosLosAlumnos = todosLosAlumnos;
        this.todasLasMaterias = todasLasMaterias;
        llenarComboMaterias();
        llenarComboAlumnos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbMaterias = new javax.swing.JComboBox<>();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Elija una Materia");

        jLabel3.setText("Elija un Alumno");

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbInscribir)
                                .addGap(71, 71, 71)
                                .addComponent(jbSalir))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.Alignment.LEADING, 0, 190, Short.MAX_VALUE)
                                .addComponent(jcbMaterias, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        Alumno alumnoSeleccionado = (Alumno)jcbAlumnos.getSelectedItem();
        Materia materiaSeleccionada = (Materia)jcbMaterias.getSelectedItem();
        
        alumnoSeleccionado.agregarMateria(materiaSeleccionada);
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void llenarComboMaterias(){
        for(Materia mat : todasLasMaterias){
            jcbMaterias.addItem(mat);
        }
    }
    
    private void llenarComboAlumnos(){
        for(Alumno alu : todosLosAlumnos){
            jcbAlumnos.addItem(alu);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JComboBox<Materia> jcbMaterias;
    // End of variables declaration//GEN-END:variables
}