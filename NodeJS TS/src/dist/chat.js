"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.io = exports.httpServer = void 0;
const express_1 = __importDefault(require("express"));
const http_1 = __importDefault(require("http"));
const socket_io_1 = require("socket.io");
const app = express_1.default;
const httpServer = http_1.default.createServer(app);
exports.httpServer = httpServer;
const io = new socket_io_1.Server(httpServer);
exports.io = io;
/*
var dadosChat = {
    url: "127.0.0.1",
    port: 3000,
    sala: "default"
}



// iniciando WebSocket
let socket = () => {
    io.on("connection", (socket) => {
        console.log(socket.data)

        socket.onAny("sala", (event) => {
            console.log ("evento recebido")
        })

    })
}
*/ 
