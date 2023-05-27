FROM node:16-alpine3.11
WORKDIR /app
COPY ./package.json .
COPY . .
RUN npm install
CMD ["node", "server.js"]