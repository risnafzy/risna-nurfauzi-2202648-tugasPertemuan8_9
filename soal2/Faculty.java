/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author ACER
 */
public class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;
    
    public Faculty(String nama,String alamat, String noTelpon, String email, String kantor, double gaji, MyDate tanggalDipekerjakan, int jamKerja, String pangkat){
        super(nama, alamat, noTelpon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }
    
    @Override
    public String toString(){
        return "Fakultas : " + super.toString();
    }
}