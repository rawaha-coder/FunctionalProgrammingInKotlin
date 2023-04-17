fun moveDisk(disks: Int, from: Int, to: Int, using: Int) {
    if (disks > 0) {
        moveDisk(disks - 1, from, using, to)
        println("Moving $disks from $from to $to")
        moveDisk(disks - 1, using, to, from)
    }
}

fun main() {
    moveDisk(disks = 5, from = 1, to = 3, using = 2)
}