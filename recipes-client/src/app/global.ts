export { } // this will make it module

declare global { // this is important to access it as global type String

    interface String {
        truncate(length: number): string;
    }
}

String.prototype.truncate = function(length: number = 255) {
    return this.length <= length ? this : this.substring(0, length-1) + '...';
}