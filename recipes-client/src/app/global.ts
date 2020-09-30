export { } // this will make it module

declare global { // this is important to access it as global type String

    interface String {
        truncate(length: number): string;
        text2html(): string;
    }
}

String.prototype.truncate = function(length: number = 255) {
    return this.length <= length ? this : this.substring(0, length-1) + '...';
}

String.prototype.text2html = function(length: number = 255) {
    return this.split('\n').join('<br/><br/>');
}