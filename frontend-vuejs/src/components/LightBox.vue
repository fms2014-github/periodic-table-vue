<template>
  <div class="lightbox">
    <router-link :to="{ name: 'Home' }">
      <slot></slot>
    </router-link>
  </div>
</template>

<script>
export default {};
</script>

<style lang="scss">
.lightbox {
  display: inline-flex;
  justify-content: center;
  align-items: center;
  gap: 280px;
  opacity: 0;
  background-color: rgba(50, 50, 50, 0.65);
  position: absolute;
  top: 0px;
  left: 0px;
  width: 100vw;
  height: 100vh;
  min-width: $backgroundWdith;
  min-height: $backgroundHeight;

  .atom-icon {
    display: inline-flex;
    flex-direction: column;
    align-items: center;
    justify-content: space-evenly;
    width: 200px;
    height: 200px;
    background-color: rgb(255, 255, 255);
    border: {
      radius: 10px;
      width: 4px;
      color: rgb(223, 122, 11);
      style: solid;
    }
    color: rgb(223, 122, 11);

    .atom-name {
      font-size: 64px;
    }
    .atom-full-name {
      font-size: 24px;
    }
    .atom-num {
      font-size: 18px;
    }
  }
  .atom-info {
    display: inline-block;
    width: 30%;
    height: 70%;
    min-width: 600px;
    max-width: 800px;
    min-height: 400px;
    max-height: 700px;
    border: {
      style: solid;
      width: 4px;
      color: rgb(223, 122, 11);
      radius: 10px;
    }
    background-color: white;
    p {
      margin: 0px;
      padding: 20px;
      color: rgb(223, 122, 11);
    }
  }
}
</style>
