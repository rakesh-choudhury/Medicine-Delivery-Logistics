/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicinetype;

/**
 *
 * @author quanp
 */
public class Medicine {

    private MedicineType MedicineType;

    public enum MedicineType {
        Cyclobenzaprine("Cyclobenzaprine"),
        Oxycodone("Oxycodone"),
        Trazodone("Trazodone"),
        Amoxicillin("Amoxicillin"),
        Metoprolol("Metoprolol"),
        Hydrochlorothiazide("Hydrochlorothiazide"),
        Ibuprofen("Ibuprofen");

        private String value;

        private MedicineType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public MedicineType getEnterpriseType() {
        return MedicineType;
    }
}
