package shop

class Vet extends Person {

    static hasMany = [specialities: Speciality]
}
